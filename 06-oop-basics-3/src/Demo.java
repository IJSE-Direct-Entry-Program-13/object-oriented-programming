void main(){
    Customer c1, c2, c3;
    c1 = new Customer();
    c2 = new Customer();
    c3 = new Customer();
    c1.id = 1;
    c1.name = "Kasun";
    c1.address = "Galle";

    c2.id = 2;
    c2.name = "Nuwan";
    c2.address = "Panadura";

    c3.id = 3;
    c3.name = "Ruwan";
    c3.address = "Galle";

    System.out.println(c2.address);
}