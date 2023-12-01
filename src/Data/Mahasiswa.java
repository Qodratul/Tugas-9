package Data;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class Mahasiswa {
    private JComboBox cbhari;
    private JComboBox cbbulan;
    private JButton proses;
    private JTextField tfnama;
    private JComboBox cbtahun;
    private JPanel main;
    private JTextArea tralamat;
    private JLabel lbnama;
    private JLabel lbtanggalLahir;
    private JLabel lblamat;
    private JLabel lbusia;
    private JPanel secondmain;

    public JPanel getMain() {
        return main;
    }
    public Mahasiswa() {
        proses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = tfnama.getText();
                int tanggal = Integer.parseInt((String) cbhari.getSelectedItem());
                int bulan = cbbulan.getSelectedIndex() + 1;
                int tahun = Integer.parseInt ((String) cbtahun.getSelectedItem());

                String alamat = tralamat.getText();
                LocalDate tanggalLahir = LocalDate.of(tahun, bulan, tanggal);
                LocalDate currentDate = LocalDate.now();
                Period usia = Period.between(tanggalLahir, currentDate);

                lbnama.setText(": " + nama);
                lbtanggalLahir.setText(": " + String.valueOf(tanggalLahir));
                lblamat.setText(": " + alamat);
                lbusia.setText(": " + usia.getYears() + " tahun, " + usia.toTotalMonths() + " bulan, " + usia.getDays() + " hari.");
            }
        });
    }
}
