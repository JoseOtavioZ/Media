import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Media extends JFrame{
    private JTextField textPrimeira;
    private JTextField textSegunda;
    private JButton ButtonCalcularMedia;
    private JTextField textMedia;
    private JTextField textSituacao;
    public JPanel formMedia;
    private JButton CALCULARSUBButton;
    private JTextField textNotaSub;
    private JComboBox comboBox1;
    private JTextField textMediaSub;
    private JTextField textSituacaoSub;

    public JTextField getTextPrimeira() {
        return textPrimeira;
    }

    public void setTextPrimeira(JTextField textPrimeira) {
        this.textPrimeira = textPrimeira;
    }

    public JTextField getTextSegunda() {
        return textSegunda;
    }

    public void setTextSegunda(JTextField textSegunda) {
        this.textSegunda = textSegunda;
    }

    public JTextField getTextMedia() {
        return textMedia;
    }

    public void setTextMedia(JTextField textMedia) {
        this.textMedia = textMedia;
    }

    public Media() {
    ButtonCalcularMedia.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Double media = (Double.valueOf(textPrimeira.getText())+ Double.valueOf(textSegunda.getText()))/2;
            textMedia.setText(media.toString());
            if(media>=7d){
                textSituacao.setText("Aprovado");
            }
            else {
                textSituacao.setText("Reprovado");

            }
        }
    });
        CALCULARSUBButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox1.getSelectedIndex() == 0) {
                    Double mediaSub = (Double.valueOf(textNotaSub.getText()) + Double.valueOf(getTextSegunda().getText())) / 2;
                    textMediaSub.setText(mediaSub.toString());
                    if (mediaSub >= 7d) {
                        textSituacaoSub.setText("Aprovado");
                    } else {
                        textSituacaoSub.setText("Reprovado");
                    }
                }
                    else if (comboBox1.getSelectedIndex() == 1) {
                        Double mediaSub = (Double.valueOf(textNotaSub.getText()) + Double.valueOf(getTextPrimeira().getText())) / 2;
                        textMediaSub.setText(mediaSub.toString());
                        if (mediaSub >= 7d) {
                            textSituacaoSub.setText("Aprovado");
                        }
                        else {
                            textSituacaoSub.setText("Reprovado");
                        }
                    }
                
            }
        });
    }
}
