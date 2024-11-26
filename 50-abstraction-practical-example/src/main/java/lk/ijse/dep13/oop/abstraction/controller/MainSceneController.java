package lk.ijse.dep13.oop.abstraction.controller;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import lk.ijse.dep13.oop.abstraction.tm.Customer;

public class MainSceneController {

    public Button btnNewCustomer;
    public Button btnRemove;
    public Button btnSave;
    public TableView<Customer> tblCustomers;
    public TextField txtAddress;
    public TextField txtId;
    public TextField txtName;

    public void initialize() {
        tblCustomers.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("id"));
        tblCustomers.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblCustomers.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("address"));

        setFormDisable(true);
    }

    private void setFormDisable(boolean value) {
        Node[] controls = {txtId, txtName, txtAddress, btnSave, btnRemove};
        for (int i = 0; i < controls.length; i++) controls[i].setDisable(value);
    }

    public void btnNewCustomerOnAction(ActionEvent event) {

    }

    public void btnRemoveOnAction(ActionEvent event) {

    }

    public void btnSaveOnAction(ActionEvent event) {

    }

}
