public class EncryptDecrypt {
    public static void main(String[] args) {
        char grade = 'B';
        // Encrypting Grade
        grade = (char) (grade + 8);
        System.out.println(grade);
        // Decrypting Grade
        grade = (char) (grade - 8);
        System.out.println(grade);

    }
}
