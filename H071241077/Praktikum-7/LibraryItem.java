public abstract class LibraryItem {
    protected String title;
    protected int itemId;
    protected boolean isBorrowed;
    

    public LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isBorrowed = false;
    }
    

    public abstract String getDescription();
    public abstract String borrowItem(int days);
    public abstract double calculateFine(int daysLate);
    

    public String returnItem() {
        this.isBorrowed = false;
        return title + " dikembalikan";
    }
    

    public String getTitle() {
        return title;
    }
    
    public int getItemId() {
        return itemId;
    }
    
    public boolean isBorrowed() {
        return isBorrowed;
    }
    
    public void setBorrowed(boolean borrowed) {
        this.isBorrowed = borrowed;
    }
}