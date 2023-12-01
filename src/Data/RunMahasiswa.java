package Data;

import javax.swing.*;

public class RunMahasiswa {
    public static void main(String[] args) {

        JFrame data = new JFrame("Data Mahasiswa");
        data.setContentPane(new Mahasiswa().getMain());
        data.setSize(1920, 1080);
        data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        data.setVisible(true);
    }
}
