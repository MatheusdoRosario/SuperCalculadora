import com.sun.jdi.IntegerValue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSuperCalculadora extends JFrame {

    private JPanel panel1;
    private JButton btnAc;
    private JButton btn7;
    private JButton btn4;
    private JButton btn1;
    private JButton btn0;
    private JButton btnPorc;
    private JButton btnDiv;
    private JButton btn8;
    private JButton btn9;
    private JButton btnMult;
    private JButton btn5;
    private JButton btn6;
    private JButton btnSub;
    private JButton btn2;
    private JButton btn3;
    private JButton btnSoma;
    private JButton btnVir;
    private JButton btnRes;
    private JLabel lblRes;



    public TelaSuperCalculadora() {

        lblRes.setText("0");

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lblRes.getText() != ("0")) {
                    lblRes.setText(lblRes.getText() + btn0.getText());
                }
                    if (getOp() == ' ') {
                        setV1(getV1() + btn0.getText());
                    } else {
                        setV2(getV2() + btn0.getText());
                    }


            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if (lblRes.getText().equals("0")) {
                        lblRes.setText(btn1.getText());
                        botaoAc();
                    } else {
                        lblRes.setText(lblRes.getText() + btn1.getText());
                        botaoAc();
                    }
                    if (getOp() == ' ') {
                        setV1(getV1() + btn1.getText());
                    } else {
                        setV2(getV2() + btn1.getText());
                    }

            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lblRes.getText().equals("0")) {
                    lblRes.setText(btn2.getText());
                    botaoAc();
                } else {
                    lblRes.setText(lblRes.getText() + btn2.getText());
                    botaoAc();
                }
                if (getOp() == ' ') {
                    setV1(getV1() + btn2.getText());
                } else {
                    setV2(getV2() + btn2.getText());
                }
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lblRes.getText().equals("0")) {
                    lblRes.setText(btn3.getText());
                    botaoAc();
                } else {
                    lblRes.setText(lblRes.getText() + btn3.getText());
                    botaoAc();
                }
                if (getOp() == ' ') {
                    setV1(getV1() + btn3.getText());
                } else {
                    setV2(getV2() + btn3.getText());
                }
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lblRes.getText().equals("0")) {
                    lblRes.setText(btn4.getText());
                    botaoAc();
                } else {
                    lblRes.setText(lblRes.getText() + btn4.getText());
                    botaoAc();
                }
                if (getOp() == ' ') {
                    setV1(getV1() + btn4.getText());
                } else {
                    setV2(getV2() + btn4.getText());
                }
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lblRes.getText().equals("0")) {
                    lblRes.setText(btn5.getText());
                    botaoAc();
                } else {
                    lblRes.setText(lblRes.getText() + btn5.getText());
                    botaoAc();
                }
                if (getOp() == ' ') {
                    setV1(getV1() + btn5.getText());
                } else {
                    setV2(getV2() + btn5.getText());
                }
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lblRes.getText().equals("0")) {
                    lblRes.setText(btn6.getText());
                    botaoAc();
                } else {
                    lblRes.setText(lblRes.getText() + btn6.getText());
                    botaoAc();
                }
                if (getOp() == ' ') {
                    setV1(getV1() + btn6.getText());
                } else {
                    setV2(getV2() + btn6.getText());
                }
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lblRes.getText().equals("0")) {
                    lblRes.setText(btn7.getText());
                    botaoAc();
                } else {
                    lblRes.setText(lblRes.getText() + btn7.getText());
                    botaoAc();
                }
                if (getOp() == ' ') {
                    setV1(getV1() + btn7.getText());
                } else {
                    setV2(getV2() + btn7.getText());
                }
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lblRes.getText().equals("0")) {
                    lblRes.setText(btn8.getText());
                    botaoAc();
                } else {
                    lblRes.setText(lblRes.getText() + btn8.getText());
                    botaoAc();
                }
                if (getOp() == ' ') {
                    setV1(getV1() + btn8.getText());
                } else {
                    setV2(getV2() + btn8.getText());
                }
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lblRes.getText().equals("0")) {
                    lblRes.setText(btn9.getText());
                    botaoAc();
                } else {
                    lblRes.setText(lblRes.getText() + btn9.getText());
                    botaoAc();
                }
                if (getOp() == ' ') {
                    setV1(getV1() + btn9.getText());
                } else {
                    setV2(getV2() + btn9.getText());
                }
            }
        });
        btnAc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    lblRes.setText("0");
                    btnAc.setText("AC");
                    setV1("");
                    setV2("");
                    setOp(' ');
            }
        });
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblRes.setText(" ");
                setOp('+');
            }
        });
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblRes.setText(" ");
                setOp('-');
            }
        });
        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblRes.setText(" ");
                setOp('*');
            }
        });
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblRes.setText(" ");
                setOp('/');
            }
        });
        btnPorc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOp('%');
                Operacoes porc = new Operacoes();
                porc.setValor(v1, v2, op);
                setRes(Double.toString(porc.getResultado()));
                if (getRes().contains(".0")) {
                    setRes(String.format("%.0f", porc.getResultado()));
                }
                lblRes.setText(getRes());
            }
        });

        btnVir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblRes.setText(lblRes.getText() + btnVir.getText());
                if (getOp() == ' ') {
                    setV1(getV1() + ".");
                } else {
                    setV2(getV2() + ".");
                }
            }
        });
        btnRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Operacoes ope = new Operacoes();
                ope.setValor(v1, v2, op);
                setRes(Double.toString(ope.getResultado()));
                if (getRes().contains(".0")) {
                    setRes(String.format("%.0f", ope.getResultado()));
                }
                setV1(getRes());
                setOp(' ');
                setV2("");
                lblRes.setText(getRes());

            }
        });
    }
    private static String v1 = "";
    private static String v2 = "";
    private static char op = ' ';
    private static String res = "";


    public void botaoAc() {
            btnAc.setText("C");
    }


    public static char getOp() {
        return op;
    }

    public static void setOp(char op) {
        TelaSuperCalculadora.op = op;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        TelaSuperCalculadora.res = res;
    }

    public static String getV2() {
        return v2;
    }

    public static void setV2(String v2) {
        TelaSuperCalculadora.v2 = v2;
    }

    public static String getV1() {
        return v1;
    }

    public static void setV1(String v1) {
        TelaSuperCalculadora.v1 = v1;
    }

    public static void main (String[]args){
        TelaSuperCalculadora t = new TelaSuperCalculadora();
        t.setContentPane(t.panel1);
        t.setVisible(true);
        t.setTitle("Calculadora");
        t.setBounds(600, 400, 600, 400);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }


}
