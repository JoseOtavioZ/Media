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
}
}
