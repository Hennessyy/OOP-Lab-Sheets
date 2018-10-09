public class Message {
    private String recipient;
    private String sender;
    private String message;

    //mutator methods

    /**
     *
     * @return recipient
     */

    public String getRecipient() {
        return recipient;
    }

    /**
     *
     * @return sender
     */

    public String getSender() {
        return sender;
    }

    /**
     *
     * @return message
     */

    public String getMessage() {
        return message;
    }


    //accessor methods

    /**
     *
     * @param recipient
     */

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /**
     *
     * @param sender
     */

    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     *
     * @param message
     */

    public void setMessage(String message) {
        this.message = message;
    }

    //toString method


    @Override
    public String toString(){
        return "Recipient:  "+getRecipient()+"  Sender: "+getSender()+"  Message: "+getMessage();
    }

    // no arguement constructor method


    public Message(){
        this("Not Specified","Not Specified");
    }

    // 2 method constructor method

    /**
     *
     * @param sender
     * @param recipient
     */

    public Message(String sender,String recipient){
        setSender(sender);
        setRecipient(recipient);
    }

    public String append(String msg){

        if(!msg.equals("")){
            this.message +=" "+msg;
        }


        return msg;
    }


}
