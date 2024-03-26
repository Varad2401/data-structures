package PRACTICALS;

import java.awt.*;
import java.awt.event.*;

public class RegistrationPage {
    private Frame frame;
    private Label titleLabel, nameLabel, emailLabel, passwordLabel, genderLabel, countryLabel, termsLabel;
    private TextField nameField, emailField;
    private PasswordField passwordField;
    private CheckboxGroup genderGroup;
    private Checkbox maleCheckbox, femaleCheckbox;
    private Choice countryChoice;
    private Button registerButton;

    public RegistrationPage() {
        frame = new Frame("Registration Page");
        frame.setSize(400, 300);
        frame.setLayout(null);

        titleLabel = new Label("Registration Form");
        titleLabel.setBounds(150, 30, 200, 20);
        frame.add(titleLabel);

        nameLabel = new Label("Name:");
        nameLabel.setBounds(50, 70, 100, 20);
        frame.add(nameLabel);

        nameField = new TextField();
        nameField.setBounds(160, 70, 150, 20);
        frame.add(nameField);

        emailLabel = new Label("Email:");
        emailLabel.setBounds(50, 100, 100, 20);
        frame.add(emailLabel);

        emailField = new TextField();
        emailField.setBounds(160, 100, 150, 20);
        frame.add(emailField);

        passwordLabel = new Label("Password:");
        passwordLabel.setBounds(50, 130, 100, 20);
        frame.add(passwordLabel);

        passwordField = new PasswordField();
        passwordField.setBounds(160, 130, 150, 20);
        frame.add(passwordField);

        genderLabel = new Label("Gender:");
        genderLabel.setBounds(50, 160, 100, 20);
        frame.add(genderLabel);

        genderGroup = new CheckboxGroup();
        maleCheckbox = new Checkbox("Male", genderGroup, false);
        maleCheckbox.setBounds(160, 160, 50, 20);
        frame.add(maleCheckbox);
        femaleCheckbox = new Checkbox("Female", genderGroup, false);
        femaleCheckbox.setBounds(220, 160, 60, 20);
        frame.add(femaleCheckbox);

        countryLabel = new Label("Country:");
        countryLabel.setBounds(50, 190, 100, 20);
        frame.add(countryLabel);

        countryChoice = new Choice();
        countryChoice.setBounds(160, 190, 150, 20);
        countryChoice.add("Select Country");
        countryChoice.add("USA");
        countryChoice.add("Canada");
        countryChoice.add("UK");
        countryChoice.add("Australia");
        frame.add(countryChoice);

        termsLabel = new Label("I agree to the terms and conditions.");
        termsLabel.setBounds(50, 220, 250, 20);
        frame.add(termsLabel);

        Checkbox termsCheckbox = new Checkbox();
        termsCheckbox.setBounds(30, 220, 20, 20);
        frame.add(termsCheckbox);

        registerButton = new Button("Register");
        registerButton.setBounds(170, 250, 80, 30);
        frame.add(registerButton);

        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new RegistrationPage();
    }
}
