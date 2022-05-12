package nyatproje;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Postgresql implements IAgArayuzu {

    @Override
    public KullaniciHesabi kullaniciKontrol(String kullaniciAdi, int sifre) {
        KullaniciHesabi kullaniciHesabi = null;
        System.out.println("Ağ arayüzü doğrulama işlemini yapıyor...");
        System.out.println("Veritabanına bağlanıldı ve kullanıcı sorgulanıyor ! ");

        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proje","postgres","2001");
            if (conn != null)
            {
                System.out.println("Veritabanına bağlanıldı ! ");
            }
            else{
                System.out.println("Bağlantı başarısız ! ");
            }

            String sql= "SELECT * FROM \"kullanicilar\" WHERE \"isim\"= '"+kullaniciAdi+"' AND \"sifre\" = "+sifre;

            Statement stmt  = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);


            conn.close();

            String kullaniciNo;
            String adi;

            while(rs.next())
            {
                kullaniciNo = rs.getString("id");
                adi = rs.getString("isim");
                kullaniciHesabi = new KullaniciHesabi(kullaniciNo,adi);
            }
            rs.close();
            stmt.close();


        } catch (Exception e) {
            System.out.println("Bağlantı girişimi başarısız!");
            e.printStackTrace();
        }
        return kullaniciHesabi;
    }
}
