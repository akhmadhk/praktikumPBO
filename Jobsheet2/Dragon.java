package Jobsheet2;

public class Dragon {
    int x;
    int y;
    int direction;

public Dragon() {
    x = 0;
    y = 0;
    direction = 1; // Default arah ke Atas
}
public void changeDirection(int newDirection) {
    if (newDirection >= 0 && newDirection <= 3) {
            direction = newDirection;
    } else {
        System.out.println("Arah tidak valid. Gunakan 1-4.");
    }
}public void move(int steps) {
    switch (direction) {
        case 1: // Atas
            y += steps;
            break;
        case 2: // Kanan
            x += steps;
            break;
        case 3: // Bawah
            y -= steps;
            break;
        case 4: // Kiri
            x -= steps;
            break;
    }
}public void printPosition() {
    System.out.println("Posisi Dragon: (" + x + ", " + y + ")arah: " + direction);
}
}
