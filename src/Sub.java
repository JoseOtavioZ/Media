import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Sub extends Media{
    private JTextField textNotaSub;
    private JComboBox comboBox1;
    private JTextField textMediaSub;
    private JTextField textSituacaoSub;
    public JPanel formSub;

    public Sub() {
    textMediaSub.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (comboBox1.getSelectedIndex() == 0) {
                Double mediaSub = (Double.valueOf(textNotaSub.getText()) + Double.valueOf(getTextSegunda().getText())) / 2;
                textMediaSub.setText(mediaSub.toString());
                if (mediaSub >= 7d) {
                    textSituacaoSub.setText("Aprovado");
                } else {
                    textSituacaoSub.setText("Reprovado");
                }
                if (comboBox1.getSelectedIndex() == 1) {
                    Double media = (Double.valueOf(textNotaSub.getText()) + Double.valueOf(getTextPrimeira().getText())) / 2;
                    textMediaSub.setText(mediaSub.toString());
                    if (media >= 7d) {
                        textSituacaoSub.setText("Aprovado");
                    } else {
                        textSituacaoSub.setText("Reprovado");
                    }
                }
            }
        }
    });
}
}
