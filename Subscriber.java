public class Subscriber {
    int id;
    int phoneNumber;
    String firsName;
    String lastName;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("id:%d fn:%s ln:%s pn:%d", id, firsName, lastName, phoneNumber);
    }
}
