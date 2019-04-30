public class WektoryRoznejDlugosciException extends Exception{
    private Integer w1Size;
    private Integer w2Size;

    public WektoryRoznejDlugosciException(Integer w1Size, Integer w2Size, String message) {
        super(message);
        this.w1Size = w1Size;
        this.w2Size = w2Size;
    }

    public Integer getWektor1Size(){
        return w1Size;
    }

    public Integer getWektor2Size(){
        return w2Size;
    }

}
