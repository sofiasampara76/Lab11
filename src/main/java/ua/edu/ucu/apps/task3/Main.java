package ua.edu.ucu.apps.task3;

public class Main {
    public static void main(String[] args) {
        RealImage image = new RealImage("C:\\Users\\admin\\Pictures\\Фоновые изображения рабочего стола\\4. Кот с наушниками.jpg");
        // Доробити проксі (який є медіатором між створенням ріал імеджа, щоб не створювалася іконка картинки до того, як її мають показати)
        // Знову вибачте, будь ласка, за російську((
        image.display();
    }
}
