public class Main {
    public static void main(String[] args) {
        // Создайте класс  Book, который содержит в себе данные о названии,
        // авторе и годе публикации книги. Типы полей должны быть String,
        // Author (его мы создадим в п. 2) и int.
        //Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
        //Напишите конструкторы  для обоих классов, заполняющие все поля.
        //Создайте геттеры для всех полей автора и всех полей книги.
        //Создайте сеттер для поля «Год публикации» у книги.
        //В методе main создайте несколько объектов «Книга» (достаточно двух)
        // и несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их.
        // Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
        //Метод main не должен находиться в классах Book и Author.
        //Создайте отдельный класс для запуска приложения и объявите метод main в нем.
        //В том же методе main измените год публикации одной из книг с помощью сеттера.

        Author alexanderPushkin = new Author("Осень");
        Author alexanderBlok = new Author("Россия");
        System.out.println("Авторы стихотворений  = " + alexanderPushkin.getLastName() +
                " Пушкин и Блок " + alexanderBlok.getLastName());
        Book authorNameTolstoy = new Book("Л.Н.Толстой", "Война и мир", 1867);
        System.out.println("Автор = " + authorNameTolstoy.getAuthor());
        System.out.println("Название = " + authorNameTolstoy.getTitle());
        System.out.println("год выпуска = " + authorNameTolstoy.getYear());
        authorNameTolstoy.setYear(1868);
        System.out.println("authorNameTolstoy.getYear() = " + authorNameTolstoy.getYear());
        Book authorNameDostoevsky = new Book("Ф.М.Достоевский", "Преступление и наказание", 1866);
        System.out.println("Автор = " + authorNameDostoevsky.getAuthor());
        System.out.println(" Название = " + authorNameDostoevsky.getTitle());
        System.out.println("год выпуска = " + authorNameDostoevsky.getYear());
        authorNameDostoevsky.setYear(1867);
        System.out.println("authorNameDostoevsky.getYear() = " + authorNameDostoevsky.getYear());


    }
}
