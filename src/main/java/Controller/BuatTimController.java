package src.main.java.Controller;

import src.main.java.Model.Tim;
import src.main.java.Model.User;
import src.main.java.View.BuatTimView;
import src.main.java.View.MenuTimView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuatTimController {
    BuatTimView menu;
    User user;
    MenuTimView menuTim;
    class btnBuat implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            String nama = menu.getNama();
            String profil = menu.getProfil();
            int kapasitas = menu.getKapasitas();
            Tim tambahTim = new Tim(nama, profil, kapasitas);
            user.buatTim(tambahTim);
            menu.dispose();
            menuTim.reset();
            menuTim.tampilTim();
        }
        
    }
    class btnKembali implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            menu.dispose();
        }
        
    }
    public BuatTimController(BuatTimView view, User user, MenuTimView menuTim){
        menu = view;
        this.menuTim = menuTim;
        this.user = user;
        menu.klikBtnBuat(new btnBuat());
        menu.klikBtnKembali(new btnKembali());
    }
}
