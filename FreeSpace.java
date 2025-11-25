public class FreeSpace extends GameObject{
    private static FreeSpace freeSpace;
    private FreeSpace(){
        freeSpace = new FreeSpace();
    }

    public static FreeSpace getFreeSpace(){
        return freeSpace;
    }
}
