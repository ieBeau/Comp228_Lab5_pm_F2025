package application;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

class CustomGridPaneCenter extends GridPane {
    public CustomGridPaneCenter() {

        setAlignment(Pos.CENTER);

        setHgap(10);
        setVgap(10);
        setPadding(new Insets(10));

        // Get First Name
        Label lblFirstName = new Label("First name *");
        add(lblFirstName, 0, 0);
        TextField txtFirstName = new TextField();
        add(txtFirstName, 0, 1);

        // Get Last Name
        Label lblLastName = new Label("Last name *");
        add(lblLastName, 1, 0);
        TextField txtLastName = new TextField();
        add(txtLastName, 1, 1);

        // Get Email
        Label lblEmail = new Label("Email *");
        add(lblEmail, 0, 2, 2, 1);
        TextField txtEmail = new TextField();
        add(txtEmail, 0, 3, 2, 1);

        // Get Personal Website URL
        Label lblPersonalWebsite = new Label("Personal Website");
        add(lblPersonalWebsite, 0, 4, 2, 1);
        TextField txtPersonalWebsite = new TextField("http://");
        add(txtPersonalWebsite, 0, 5, 2, 1);

        // Get Applied Position
        Label lblPosition = new Label("Position you are applying for *");
        add(lblPosition, 0, 6, 2, 1);
        TextField txtPosition = new TextField();
        add(txtPosition, 0, 7, 2, 1);

        // Get Salary Requirements
        Label lblSalary = new Label("Salary requirements");
        add(lblSalary, 0, 8);
        TextField txtSalary = new TextField();
        add(txtSalary, 0, 9);

        // Get Start Date
        Label lblStart = new Label("When can you start?");
        add(lblStart, 1, 8);
        TextField txtStart = new TextField();
        add(txtStart, 1, 9);

        // Get Phone Number
        Label lblPhone = new Label("Phone *");
        add(lblPhone, 0, 10);
        TextField txtPhone = new TextField();
        add(txtPhone, 0, 11);

        // Get Fax Number
        Label lblFax = new Label("Fax");
        add(lblFax, 1, 10);
        TextField txtFax = new TextField();
        add(txtFax, 1, 11);

        // Get Relocation Status
        Label lblRelocate = new Label("Are you willing to relocate?");
        add(lblRelocate, 0, 12, 2, 1);
        ToggleGroup tgRelocate = new ToggleGroup();
        RadioButton rbYes = new RadioButton("Yes");
        rbYes.setToggleGroup(tgRelocate);
        RadioButton rbNo = new RadioButton("No");
        rbNo.setToggleGroup(tgRelocate);
        RadioButton rbNotSure = new RadioButton("Not sure");
        rbNotSure.setToggleGroup(tgRelocate);

        HBox hbRelocate = new HBox(10, rbYes, rbNo, rbNotSure);
        add(hbRelocate, 0, 13, 2, 1);

        // Get Name of Previous Company
        Label lblPreviousCompany = new Label("Last company you worked for");
        add(lblPreviousCompany, 0, 14, 2, 1);
        TextField txtPreviousCompany = new TextField();
        add(txtPreviousCompany, 0, 15, 2, 1);

        // Get Reference / Comments / Questions
        Label lblComments = new Label("Reference / Comments / Questions");
        add(lblComments, 0, 16, 2, 1);
        TextArea txtComments = new TextArea();
        txtComments.setWrapText(true);
        txtComments.setPrefHeight(120);
        add(txtComments, 0, 17, 2, 4);

        // Create Submit Button
        Button bySubmit = new Button("Send Application");
        add(bySubmit, 0, 22);
        GridPane.setColumnSpan(bySubmit, 2);
        GridPane.setHalignment(bySubmit, HPos.CENTER);

        SubmitHandlerClass hdlSubmit = new SubmitHandlerClass();
        bySubmit.setOnAction(hdlSubmit);
    }
}
