import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Store store=new Store();
        Phone p1 = new Phone("SAMSUNG GALAXY A51",store.getBrandByName("Samsung"),3199.0,0,4,$GB.__128__GB,6.5f,$GB.__6__GB,4000,"black");
        Phone p2 = new Phone("iPhone 11 64 GB",store.getBrandByName("Apple"),7379.0,0,1,$GB.__64__GB,6.1f,$GB.__6__GB,3046,"blue");
        Phone p3 = new Phone("Redmi Note 10 Pro 8GB",store.getBrandByName("Xiaomi"),4012.0,0,3,$GB.__128__GB,6.5f,$GB.__12__GB,4000,"white");

        Notebook nb1 = new Notebook("HUAWEI Matebook 14",store.getBrandByName("Huawei"),7000,0,3,$GB.__512__GB,14f,$GB.__16__GB);
        Notebook nb2 = new Notebook("LENOVO V14 IGL",store.getBrandByName("Lenovo"),3699,0,5,$GB.__1024__GB,14f,$GB.__8__GB);
        Notebook nb3 = new Notebook("HUAWEI Matebook 14",store.getBrandByName("Huawei"),7000,0,2,$GB.__2048__GB,15.6f,$GB.__32__GB);

        List<Notebook> notebookList = new ArrayList<>();
        notebookList.add(nb1);notebookList.add(nb2);notebookList.add(nb3);
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(p1);phoneList.add(p2);phoneList.add(p3);
        /////////////////////
        store.setNotebookList(notebookList);
        store.setPhoneList(phoneList);
        /////////////////////
        store.printBrands();
        //store.printPhones();
        //store.printNotebooks();
        store.getProductManagementPanel();
        //store.deleteNotebookById(4);
        //store.printNotebooks();
        /*

----------------------------------------------------------------------------------------------------
| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |
----------------------------------------------------------------------------------------------------
| 1  | HUAWEI Matebook 14            | 7000.0 TL | Huawei    | 512       | 14.0      | 16          |
| 2  | LENOVO V14 IGL                | 3699.0 TL | Lenovo    | 1024      | 14.0      | 8           |
| 3  | ASUS Tuf Gaming               | 8199.0 TL | Asus      | 2048      | 15.6      | 32          |
----------------------------------------------------------------------------------------------------

Notebook ürünlerinin özellikleri :
Ürünün sistemde kayıtlı benzersiz numarası
Birim fiyatı
İndirim oranı
Stok miktarı
Ürün adı
Marka bilgisi (Sistemde ekli olan markalar kullanılacaktır)
Ram (8 GB)
Depolama (512 SSD)
Ekran Boyutu (14 inç)
         */
    }
}