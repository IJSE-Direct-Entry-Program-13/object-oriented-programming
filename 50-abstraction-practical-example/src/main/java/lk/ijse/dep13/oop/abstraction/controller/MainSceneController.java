package lk.ijse.dep13.oop.abstraction.controller;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import lk.ijse.dep13.oop.abstraction.data.CustomerTo;
import lk.ijse.dep13.oop.abstraction.data.DataAccess;
import lk.ijse.dep13.oop.abstraction.data.InMemoryDataAccess;
import lk.ijse.dep13.oop.abstraction.tm.Customer;

import java.util.ArrayList;

public class MainSceneController {

    public Button btnNewCustomer;
    public Button btnRemove;
    public Button btnSave;
    public TableView<Customer> tblCustomers;
    public TextField txtAddress;
    public TextField txtId;
    public TextField txtName;
    private final DataAccess dataAccess = new InMemoryDataAccess();

    public void initialize() {
        tblCustomers.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("id"));
        tblCustomers.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblCustomers.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("address"));

        tblCustomers.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
            btnRemove.setDisable(newValue == null);
            if (newValue != null){
                txtId.setText(newValue.getId());
                txtName.setText(newValue.getName());
                txtAddress.setText(newValue.getAddress());
            }
        });

        setFormDisable(true);
        loadCustomers();
    }

    private void loadCustomers(){
        ArrayList<CustomerTo> customerList = dataAccess.findAllCustomers();
        tblCustomers.getItems().clear();
        for (int i = 0; i < customerList.size(); i++) {
            CustomerTo customer = customerList.get(i);
            tblCustomers.getItems().add(new Customer(customer.id(), customer.name(), customer.address()));
        }
    }

    private void setFormDisable(boolean value) {
        Node[] controls = {txtId, txtName, txtAddress, btnSave, btnRemove};
        for (int i = 0; i < controls.length; i++) controls[i].setDisable(value);
    }

    public void btnNewCustomerOnAction(ActionEvent event) {
        setFormDisable(false);
        txtName.clear();
        txtAddress.clear();
        txtId.setText(generateNewId());
        txtName.requestFocus();
        tblCustomers.getSelectionModel().clearSelection();
        btnRemove.setDisable(tblCustomers.getSelectionModel().getSelectedItem() == null);
    }

    private String generateNewId(){
        // "C015" => "015" => 15
        if (tblCustomers.getItems().isEmpty())  return "C001";

        int newId = Integer.parseInt(tblCustomers.getItems().getLast().getId()
                .replace("C", "")) + 1;
        return "C%03d".formatted(newId);
    }

    public void btnRemoveOnAction(ActionEvent event) {
        Customer selectedCustomer = tblCustomers.getSelectionModel().getSelectedItem();

        if (dataAccess.deleteCustomer(selectedCustomer.getId())){
            tblCustomers.getItems().remove(selectedCustomer);
            if (tblCustomers.getItems().isEmpty()){
                setFormDisable(true);
                txtId.clear();
                txtName.clear();
                txtAddress.clear();
            }
        }else{
            new Alert(Alert.AlertType.ERROR, "Failed to delete the customer, try again").show();
        }
    }

    public void btnSaveOnAction(ActionEvent event) {
        if (!validateData()) return;

        CustomerTo customer = new CustomerTo(txtId.getText().strip(),
                txtName.getText().strip(),
                txtAddress.getText().strip());

        if (dataAccess.saveCustomer(customer)){
            tblCustomers.getItems().add(new Customer(customer.id(), customer.name(), customer.address()));
            btnNewCustomer.fire();
        }else{
            new Alert(Alert.AlertType.ERROR, "Failed to save the customer, try again").show();
            txtName.requestFocus();
            txtName.selectAll();
        }
    }

    private boolean validateData(){
        boolean valid = true;
        if (txtAddress.getText().strip().length() < 3) {
            txtAddress.requestFocus();
            txtAddress.selectAll();
            valid = false;
        }

        if (!txtName.getText().strip().matches("[A-Za-z ]+")){
            txtName.requestFocus();
            txtName.selectAll();
            valid = false;
        }
        return valid;
    }

}
