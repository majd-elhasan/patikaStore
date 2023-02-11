import java.util.*;

public class Store {
    private Set<Brand> brands = new TreeSet<>();
    private List<Phone> phoneList;
    private List<Notebook> notebookList;
    public Store(){
        this.brands.add(new Brand("Samsung"));this.brands.add(new Brand("Lenovo"));
        this.brands.add(new Brand("Apple"));this.brands.add(new Brand("Huawei"));
        this.brands.add(new Brand("Casper"));this.brands.add(new Brand("Asus"));
        this.brands.add(new Brand("HP"));this.brands.add(new Brand("Xiaomi"));
        this.brands.add(new Brand("Monster"));
    }

    public Set<Brand> getBrands() {
        return brands;
    }
    public Brand getBrandByName(String name){
        for (Brand brand : this.brands){
            if (brand.getName().equalsIgnoreCase(name))
                return brand;
        }
        return null;
    }

    public void setBrands(Set<Brand> brands) {
        this.brands = brands;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    public List<Notebook> getNotebookList() {
        return notebookList;
    }

    public void setNotebookList(List<Notebook> notebookList) {
        this.notebookList = notebookList;
    }
    public void printBrands(){
        System.out.println(getBrands());
    }
    public void printNotebooks(){
        List<Notebook> notebooks = listAndFilter(getNotebookList());
        int ID_len= 0;
        int name_len =0;
        int brand_len = 0;
        int price_len = 0;
        int discount_len = 0;
        int storage_len = 0;
        int screenSize_len = 0;
        int ram_len = 0;
        int stock_len = 0;
        for (Notebook notebook:notebooks){
            ID_len = Math.max((notebook.getId()+"").length(),ID_len);
            name_len = Math.max(notebook.getName().length(), name_len);
            brand_len = Math.max((notebook.getBrand()+"").length(),brand_len);
            price_len = Math.max((notebook.getUnitPrice()+"").length(),price_len);
            discount_len = Math.max((notebook.getDiscountPercentage()+"").length(),discount_len);
            storage_len = Math.max((notebook.getStorage()+"").length(),storage_len);
            screenSize_len = Math.max((notebook.getScreenSizeInInch()+"").length(),screenSize_len);
            ram_len = Math.max((notebook.getRAM()+"").length(),ram_len);
            stock_len = Math.max((notebook.getStock()+"").length(),stock_len);
        }
        ID_len +=3;name_len +=3;brand_len +=3;price_len +=3;discount_len +=3;storage_len +=3;screenSize_len +=3;ram_len +=3;stock_len+=4;
        ID_len= Math.max("| ID ".length(), ID_len); //4
        name_len= Math.max("| Ürün adı ".length(), name_len); //24
        brand_len = Math.max("| Marka ".length(), brand_len); //10
        price_len = Math.max("| Fiyat ".length(), price_len); //9
        discount_len = Math.max("| Indirim ".length(), discount_len); //6
        storage_len = Math.max("| Depolama ".length(), storage_len); //12
        screenSize_len = Math.max("| Ekran ".length(), screenSize_len); //6
        ram_len = Math.max("| RAM ".length(), ram_len); //11
        stock_len = Math.max("| Stok ".length(), stock_len); //5
        int count=ID_len+name_len+brand_len+price_len+discount_len+storage_len+screenSize_len+ram_len+stock_len+1;
        System.out.println("Notebook Listesi \n");
        System.out.println("-".repeat(count));
        printTitle("| ID ",ID_len);
        printTitle("| Ürün adı ",name_len);
        printTitle("| Marka ",brand_len);
        printTitle("| Fiyat ",price_len);
        printTitle("| Indirim ",discount_len);
        printTitle("| Depolama ",storage_len);
        printTitle("| Ekran ",screenSize_len);
        printTitle("| RAM ",ram_len);
        printTitle("| Stok ",stock_len);
        System.out.println("|");
        System.out.println("-".repeat(count));
        for (Notebook notebook:notebooks){
            printCell(notebook.id+"",ID_len);
            printCell(notebook.name,name_len);
            printCell(notebook.brand.getName(),brand_len);
            printCell(notebook.unitPrice+"",price_len);
            printCell(notebook.discountPercentage+"",discount_len);
            printCell(notebook.storage.toString().replace("_"," ").trim(),storage_len);
            printCell(notebook.screenSizeInInch+"",screenSize_len);
            printCell(notebook.RAM.toString().replace("_"," ").trim(),ram_len);
            printCell(notebook.stock+"",stock_len);
            System.out.println("|");
        }
        System.out.println("-".repeat(count));
    }
    public void printPhones(){
        List<Phone> phones = listAndFilter(getPhoneList());

        int ID_len= 0;
        int name_len =0;
        int brand_len = 0;
        int price_len = 0;
        int discount_len = 0;
        int storage_len = 0;
        int screenSize_len = 0;
        int ram_len = 0;
        int batteryPower_len = 0;
        int color_len = 0;
        int stock_len = 0;
        for (Phone phone:phones){
            ID_len = Math.max((phone.getId()+"").length(),ID_len);
            name_len = Math.max(phone.getName().length(), name_len);
            brand_len = Math.max((phone.getBrand()+"").length(),brand_len);
            price_len = Math.max((phone.getUnitPrice()+"").length(),price_len);
            discount_len = Math.max((phone.getDiscountPercentage()+"").length(),discount_len);
            storage_len = Math.max((phone.getStorage()+"").length(),storage_len);
            screenSize_len = Math.max((phone.getScreenSizeInInch()+"").length(),screenSize_len);
            ram_len = Math.max((phone.getRAM()+"").length(),ram_len);
            batteryPower_len = Math.max((phone.getBatteryPower()+"").length(),batteryPower_len);
            color_len = Math.max((phone.getColor()+"").length(),color_len);
            stock_len = Math.max((phone.getStock()+"").length(),stock_len);
        }
        ID_len +=3;name_len +=3;brand_len +=3;price_len +=3;discount_len +=3;storage_len +=3;screenSize_len +=3;ram_len +=3;batteryPower_len +=3;color_len +=3;stock_len+=4;
        ID_len= Math.max("| ID ".length(), ID_len); //4
        name_len= Math.max("| Ürün adı ".length(), name_len); //24
        brand_len = Math.max("| Marka ".length(), brand_len); //10
        price_len = Math.max("| Fiyat ".length(), price_len); //9
        discount_len = Math.max("| Indirim ".length(), discount_len); //6
        storage_len = Math.max("| Depolama ".length(), storage_len); //12
        screenSize_len = Math.max("| Ekran ".length(), screenSize_len); //6
        ram_len = Math.max("| RAM ".length(), ram_len); //11
        batteryPower_len = Math.max("| Pil gücü ".length(), batteryPower_len); //7
        color_len = Math.max("| Renk ".length(), color_len); //8
        stock_len = Math.max("| Stok ".length(), stock_len); //5
        int count=ID_len+name_len+brand_len+price_len+discount_len+storage_len+screenSize_len+ram_len+batteryPower_len+color_len+stock_len+1;
        System.out.println("Cep Telefonu Listesi\n");
        System.out.println("-".repeat(count));
        printTitle("| ID ",ID_len);
        printTitle("| Ürün adı ",name_len);
        printTitle("| Marka ",brand_len);
        printTitle("| Fiyat ",price_len);
        printTitle("| Indirim ",discount_len);
        printTitle("| Depolama ",storage_len);
        printTitle("| Ekran ",screenSize_len);
        printTitle("| RAM ",ram_len);
        printTitle("| Pil gücü ",batteryPower_len);
        printTitle("| Renk ",color_len);
        printTitle("| Stok ",stock_len);
        System.out.println("|");
        System.out.println("-".repeat(count));
        for (Phone phone:phones){
            printCell(phone.id+"",ID_len);
            printCell(phone.name,name_len);
            printCell(phone.brand.getName(),brand_len);
            printCell(phone.unitPrice+"",price_len);
            printCell(phone.discountPercentage+"",discount_len);
            printCell(phone.storage.toString().replace("_"," ").trim(),storage_len);
            printCell(phone.screenSizeInInch+"",screenSize_len);
            printCell(phone.RAM.toString().replace("_"," ").trim(),ram_len);
            printCell(phone.getBatteryPower()+"",batteryPower_len);
            printCell(phone.getColor(),color_len);
            printCell(phone.stock+"",stock_len);
            System.out.println("|");
        }
        System.out.println("-".repeat(count));
    }
    void printTitle(String title,int maxLen){
        System.out.print(title.length()<maxLen?title+" ".repeat(maxLen-title.length()):title);
    }
    void printCell(String text,int maxLen){
        System.out.print("| "+ text+" ".repeat(maxLen-("| "+text).length()));
    }
    private <T extends Product> List<T> listAndFilter(List<T> list){
        List<T> result = new ArrayList<>(list);
        System.out.println("marka adına göre mi listelemek istiyorsun ? (e/h)");
        if (Input.Input.nextLine().equalsIgnoreCase("e")){
            result = listByBrand(result);
            System.out.println("liste marka adına göre filtrelenecektir..");
            System.out.print("markanın adının olabileceği alt sınırı gir > ");
            String lower = Input.Input.nextLine();
            System.out.print("markanın adının olabileceği üst sınırı gir > ");
            String upper = Input.Input.nextLine();

            if (lower.isBlank() || !lower.chars().allMatch(Character::isLetter)) lower = "a";
            if (upper.isBlank() || !upper.chars().allMatch(Character::isLetter)) upper = "z";

            result = filterByBrandName(result,upper,lower);
        }else {
            System.out.print("listelenecek en düşük ID'yi gir > ");
            int lower = getInteger(Input.Input.nextLine());
            System.out.print("listelenecek en yüksek ID'yi gir > ");
            int upper = getInteger(Input.Input.nextLine());
            if (upper==0)
                upper = Integer.MAX_VALUE;

            result = filterById(result,upper,lower);
        }
        return result;
    }


    private int getInteger(String in){
        int num;
        try{
            num = Integer.parseInt(in);
        }catch (Exception e){
            num = 0;
        }
        return num;
    }
    private  <T extends Product> List<T> listByBrand(List<T> inList){
        List<T> outList = new ArrayList<>(inList);
        outList.sort((o1, o2) -> Comparator.comparing(Brand::getName).compare(o1.getBrand(),o2.getBrand()));
        return outList;
    }

    private <T extends Product> List<T> filterById(List<T> inList,int upperBound,int lowerBound){
        return inList.stream()
                .filter(p -> p.getId() < upperBound)
                .filter(p -> p.getId() > lowerBound)
                .toList();
    }
    private <T extends Product> List<T> filterByBrandName(List<T> inList,String higherThan,String lowerThan){
        int h = higherThan.length();
        int l = lowerThan.length();
        return inList.stream()
                .filter(p -> p.getBrand().getName().substring(0,l).toLowerCase().compareTo(lowerThan.toLowerCase()) >= 0
                          && p.getBrand().getName().substring(0,h).toLowerCase().compareTo(higherThan.toLowerCase()) < 0)
                .toList();
    }

    void phonePanel(){
        System.out.print("1 - telefon ekle.\n2 - id'ye göre telefon sil.\n3 - telefon'ları listele.\n\n0 - Çıkış Yap.\n");
        switch (new Scanner(System.in).nextLine()){
            case "1" -> addPhone();
            case "2" -> deletePhoneById(0);
            case "3" -> printPhones();
        }
    }
    void noteBookPanel(){
        System.out.print("1 - notebook ekle.\n2 - id'ye göre notebook sil.\n3 - notebook'ları listele.\n\n0 - Çıkış Yap.\n");
        switch (new Scanner(System.in).nextLine()){
            case "1" -> addNotebook();
            case "2" -> deleteNotebookById(0);
            case "3" -> printNotebooks();
        }
    }
    public void getProductManagementPanel(){
        System.out.print("1 - Notebook İşlemleri.\n2 - Cep Telefonu İşlemleri.\n3 - Marka Listele.\n\n0 - Çıkış Yap.\n");
        String a;
        switch ( a = new Scanner(System.in).nextLine()){
            case "1" -> {
                System.out.println("Tercihiniz : "+a+"\n");
                // add - removeById - showFilteredBy
                noteBookPanel();
            }
            case "2" -> {
                System.out.println("Tercihiniz : "+a+"\n");
                // add - removeById - showFilteredBy
                phonePanel();
            }
            case "3" -> {
                System.out.println("Tercihiniz : "+a+"\n");
                printBrands();
            }
        }
    }
    public void deleteNotebookById(int id){
        System.out.println(notebookList.removeIf(notebook -> notebook.id == id)?"deleted successfully !":"no such notebook with id '"+id+"'!");
    }
    public void deletePhoneById(int id){
        System.out.println(phoneList.removeIf(phone -> phone.id == id)?"deleted successfully !":"no such phone with id '"+id+"'!");
    }
    Brand detectBrand(){
        String brand;
        int c ;
        do {
            System.out.print("enter the brand : ");
            brand = Input.Input.nextLine();
            c = 0;
            for (Brand b : brands) {
                if (b.getName().equalsIgnoreCase(brand)) break;
                c++;
            }
        } while (c == brands.size());
        return this.getBrandByName(brand.substring(0,1).toUpperCase()+brand.substring(1).toLowerCase());
    }
    $GB detectMemory(String storage_type){
        String storage;
        int c2;
        do {
            System.out.print("enter the "+storage_type+" storage : ");
            storage = Input.Input.nextLine();
            c2 = 0;
            for ($GB s : $GB.values()) {
                if (s.name().equalsIgnoreCase("__"+storage+"__GB")) break;
                c2++;
            }
        } while (c2 == $GB.values().length);

        return $GB.valueOf("__" + storage + "__GB");
    }
    Double enterDouble(String num) {
        double n;
        try {
            n = Double.parseDouble(num);
        } catch (Exception e) {
            return null;
        }
        return n;
    }
    public void addNotebook() {

        String name;
        do {System.out.print("enter the notebook name : ");
        name = Input.Input.nextLine();
        }while (name.equals(""));

        Brand brandObj = detectBrand();
        $GB storage = detectMemory("");

        System.out.print("enter the screen size in inch : ");
        float screenSize = Float.parseFloat(Input.Input.nextLine());
        $GB ram = detectMemory("RAM");
        Double price;
        do {
        System.out.print("enter the unit price : ");
        price = enterDouble(Input.Input.nextLine());
        }while (price==null);

        Double discount;
        do {
            System.out.print("enter the discount : ");
            discount = enterDouble(Input.Input.nextLine());
        }while (discount==null);

        Notebook localNotebook = new Notebook(name,brandObj,price,discount,storage,screenSize,ram);
        int c4 = 0;
        boolean isFound = false;
        for (Notebook notebook:getNotebookList()){
            if (localNotebook.equalsExceptID(notebook)){notebook.setStock(notebook.stock+1);isFound=true; break;}
            c4++;
        }
        if (c4 == notebookList.size() && !isFound)
            this.notebookList.add(localNotebook);
    }

    public void addPhone() {
        String name;
        do {System.out.print("enter the phone name : ");
            name = Input.Input.nextLine();
        }while (name.equals(""));

        Brand brandObj = detectBrand();
        $GB storage = detectMemory("");

        System.out.print("enter the screen size in inch : ");
        float screenSize = Float.parseFloat(Input.Input.nextLine());
        $GB ram = detectMemory("RAM");
        Double price;
        do {
            System.out.print("enter the unit price : ");
            price = enterDouble(Input.Input.nextLine());
        }while (price==null);

        Double discount;
        do {
            System.out.print("enter the discount : ");
            discount = enterDouble(Input.Input.nextLine());
        }while (discount==null);

        int batteryPower ;
        do {
            System.out.print("enter the battery power : ");
            try{
            batteryPower = Integer.parseInt(Input.Input.nextLine());
            }catch (Exception e){
                batteryPower=0;
            }
        }while (batteryPower==0);

        System.out.print("enter the color : ");
        String color = Input.Input.nextLine();

        Phone localPhone = new Phone(name,brandObj,price,discount,storage,screenSize,ram,batteryPower,color);
        int c4 = 0;
        boolean isFound = false;
        for (Phone phone:getPhoneList()){
            if (localPhone.equalsExceptID(phone)){phone.setStock(phone.stock+1);isFound=true; break;}
            c4++;
        }
        if (c4 == phoneList.size() && !isFound)
            this.phoneList.add(localPhone);
    }

}
