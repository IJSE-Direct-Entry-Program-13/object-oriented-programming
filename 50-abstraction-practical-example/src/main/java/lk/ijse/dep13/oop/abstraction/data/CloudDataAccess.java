package lk.ijse.dep13.oop.abstraction.data;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class CloudDataAccess implements DataAccess{

    static {
        try {
            InputStream serviceAccount =
                    CloudDataAccess.class.getResourceAsStream("/oop-abstraction-firebase-adminsdk-vig2z-e951ead69b.json");

            if (serviceAccount == null) throw new RuntimeException("Service account not found");

            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

            FirebaseApp.initializeApp(options);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    private final Firestore db = FirestoreClient.getFirestore();
    private final CollectionReference customerRef = db.collection("customer");

    @Override
    public boolean saveCustomer(CustomerTo customer) {
        ArrayList<CustomerTo> customerList = findAllCustomers();
        for (int i = 0; i < customerList.size(); i++) {
            CustomerTo c = customerList.get(i);
            if (c.id().matches(customer.id())) return false;
        }

        customerRef.add(customer);
        return true;
    }

    @Override
    public boolean deleteCustomer(String id) {
        ArrayList<CustomerTo> customerList = findAllCustomers();
        for (int i = 0; i < customerList.size(); i++) {
            CustomerTo c = customerList.get(i);
            if (c.id().matches(id)){
                try {
                    QuerySnapshot querySnapshot = customerRef.whereEqualTo("id", c.id()).get().get();
                    querySnapshot.getDocuments().getFirst().getReference().delete();
                    return true;
                }catch (Exception e){
                    e.printStackTrace();
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public ArrayList<CustomerTo> findAllCustomers() {
        final ArrayList<CustomerTo> customerList = new ArrayList<>();

        try {
            QuerySnapshot query = customerRef.orderBy("id").get().get();
            List<QueryDocumentSnapshot> documentList = query.getDocuments();

            for (int i = 0; i < documentList.size(); i++) {
                QueryDocumentSnapshot docRef = documentList.get(i);
//                String id = docRef.get("id", String.class);
//                String name = docRef.get("name", String.class);
//                String address = docRef.get("address", String.class);
//                customerList.add(new CustomerTo(id, name, address));
                customerList.add(docRef.toObject(CustomerTo.class));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

       return customerList;
    }
}
