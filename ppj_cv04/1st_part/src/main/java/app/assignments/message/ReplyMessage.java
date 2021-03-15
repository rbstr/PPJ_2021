package app.assignments.message;

public class ReplyMessage implements Message {

    private Message original;
    private String reply;

    public ReplyMessage(Message original, String reply) {
        this.original = original;
        this.reply = reply;
    }

    public String getSender() {
        return original.getRecipient();
    }

    public String getRecipient() {
        return original.getSender();
    }

    public String getText() {
        return "ORIGINAL:\n" + original.getText() + "\nREPLY:\n" + reply;
    }
}
