import classes.Jogo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import principal.Main;

import java.io.IOException;

public class TelaSelecModoController {

    private Jogo jogo = new Jogo();

    @FXML
    private RadioButton botaoIA;

    @FXML
    private Button botaoIniciar;

    @FXML
    private RadioButton botaoMultiplayer;

    @FXML
    private ImageView imgFundo;

    @FXML
    private ToggleGroup opcoesModo;

    @FXML
    void iniciarJogo(ActionEvent event) throws IOException {

        RadioButton radio = (RadioButton) opcoesModo.getSelectedToggle();
        System.out.println(radio);
        if(radio.getId().equals("botaoMultiplayer")){
            //jogo.iniciar("multiplayer");
            Main.setRaiz("../TelaJogo.fxml",680, 995);
        } else{
            jogo.iniciar("ia");             }
    }

}
