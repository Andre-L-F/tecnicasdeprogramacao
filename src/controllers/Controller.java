package controllers;

import Views.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Model;

public class Controller implements ActionListener {

    private final View view;
    private final Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;

        this.view.addSubBtn.addActionListener(this);
        this.view.btn0.addActionListener(this);
        this.view.btn1.addActionListener(this);
        this.view.btn2.addActionListener(this);
        this.view.btn3.addActionListener(this);
        this.view.btn4.addActionListener(this);
        this.view.btn5.addActionListener(this);
        this.view.btn6.addActionListener(this);
        this.view.btn7.addActionListener(this);
        this.view.btn8.addActionListener(this);
        this.view.btn9.addActionListener(this);
        this.view.btnAdd.addActionListener(this);
        this.view.btnC.addActionListener(this);
        this.view.btnEquals.addActionListener(this);
        this.view.btnMult.addActionListener(this);
        this.view.btnPoint.addActionListener(this);
        this.view.btnSub.addActionListener(this);
        this.view.btnCE.addActionListener(this);
        this.view.divBtn.addActionListener(this);
        this.view.sqrBtn.addActionListener(this);
        this.view.expBtn.addActionListener(this);
        this.view.percBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");
        String timestamp = now.format(formatter);
        try {
            Double x = 0.0, y = 0.0;

            if (e.getSource().equals(view.btnC) || view.res.getText().equals("0")) {
                reset();
            }

            if (e.getSource().equals(view.btn1)) {
                addNumber("1");
            }

            if (e.getSource().equals(view.btn2)) {
                addNumber("2");
            }

            if (e.getSource().equals(view.btn3)) {
                addNumber("3");
            }

            if (e.getSource().equals(view.btn4)) {
                addNumber("4");
            }

            if (e.getSource().equals(view.btn5)) {
                addNumber("5");
            }

            if (e.getSource().equals(view.btn6)) {
                addNumber("6");
            }

            if (e.getSource().equals(view.btn7)) {
                addNumber("7");
            }

            if (e.getSource().equals(view.btn8)) {
                addNumber("8");
            }

            if (e.getSource().equals(view.btn9)) {
                addNumber("9");
            }

            if (e.getSource().equals(view.btn0)) {
                addNumber("0");
            }

            if (e.getSource().equals(view.btnPoint)) {
                if (!view.res.getText().contains(".")) {//En caso de que el número tenga un punto, no va a permitir agregarlo
                    addNumber(".");
                }

                if (view.res.getText().equals(".")) {
                    view.res.setText("0" + ".");
                }
            }

            if (e.getSource().equals(view.addSubBtn)) {
                view.res.setText("-" + view.res.getText());
            }

            x = Double.parseDouble(view.res.getText());

            if (e.getSource().equals(view.btnCE)) {
                if (getRes() != 0) {
                    view.res.setText(view.res.getText().substring(0, view.res.getText().length() - 1));
                }
            }

            if (e.getSource().equals(view.btnAdd)) {
                model.setOperator("add");
                reset();
                assign(x);
            }

            if (e.getSource().equals(view.btnMult)) {
                model.setOperator("mult");
                reset();
                assign(x);
            }

            if (e.getSource().equals(view.btnSub)) {
                model.setOperator("sub");
                reset();
                assign(x);
            }

            if (e.getSource().equals(view.divBtn)) {
                model.setOperator("split");
                reset();
                assign(x);
            }

            if (e.getSource().equals(view.percBtn)) {
                assignRes(x);
                model.percentage(x);
                individualOp();

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Temp\\Log.csv", true))) {
                    writer.append(timestamp + ";" + x + ";" + "Porcentagem" + ";" + "Resultado=" + ";" + getRes()); // Adiciona a linha ao histórico
                    writer.newLine();
                    System.out.println("Log foi atualizado");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

            if (e.getSource().equals(view.sqrBtn)) {
                assignRes(x);
                model.sqrt(x);
                individualOp();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Temp\\Log.csv", true))) {
                    writer.append(timestamp + ";" + x + ";" + "Raiz" + ";" + "Resultado=" + ";" + getRes()); // Adiciona a linha ao histórico
                    writer.newLine();
                    System.out.println("Log foi atualizado");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                if (view.res.getText() == "NaN") {
                    view.res.setText("nao tem solucao");
                }
            }

            if (e.getSource().equals(view.expBtn)) {
                assignRes(x);
                model.exp(x);
                individualOp();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Temp\\Log.csv", true))) {
                    writer.append(timestamp + ";" + x + ";" + "Elevado" + ";" + "Resultado=" + ";" + getRes()); // Adiciona a linha ao histórico
                    writer.newLine();
                    System.out.println("Log foi atualizado");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

            if (e.getSource().equals(view.btnEquals)) {
                double res = 0;
                //Reatribuição de valores
                y = Double.parseDouble(view.res.getText());
                x = model.getX();
                String operator = model.getOperator();
                String operation = "";

                if (model.getOperator().equals("add")) {
                    model.addOperator(x, y);
                }

                if (model.getOperator().equals("mult")) {
                    model.multOperator(x, y);
                }

                if (model.getOperator().equals("split")) {
                    model.splitOperator(x, y);
                    if (view.res.getText() == "Infinity") {
                        view.res.setText("No se puede dividir un número entre cero");
                    }
                }

                if (model.getOperator().equals("sub")) {
                    model.subOperator(x, y);
                }

                res = getRes();
                view.res.setText(String.valueOf(getRes()));

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Temp\\Log.csv", true))) {
                    writer.append(timestamp + ";" + x + ";" + model.getOperator() + ";" + y + ";" + "Resultado=" + ";" + getRes()); // Adiciona a linha ao histórico
                    writer.newLine();
                    System.out.println("Log foi atualizado");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                if (getRes() == 0.0) {
                    setDefaultValue();
                }
            }
            //Manejo de excessoes
        } catch (NumberFormatException NFE) {
            view.res.setText(String.valueOf(view.res.getText().replace('-', ' ').replaceAll("\\s", "")));

            if (view.res.getText() == "") {
                setDefaultValue();
            }

        } catch (NullPointerException NPE) {
            setDefaultValue();
        } catch (StringIndexOutOfBoundsException SIE) {
            setDefaultValue();
        }
    }

    public void reset() {
        view.res.setText("");
    }

    public void assign(double x) {
        model.setX(x);
    }

    public void assignRes(double x) {
        model.setResult(x);
    }

    public void setDefaultValue() {
        view.res.setText("0");
    }

    public double getRes() {
        return model.getResult();
    }

    public void addNumber(String n) {
        view.res.setText(view.res.getText() + n);
    }

    public void individualOp() {
        view.res.setText(String.valueOf(model.getResult()));
    }
}
