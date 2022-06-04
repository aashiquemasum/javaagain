public class TextEditor {
    public static void main(String[] args){
        System.out.println("So now");
        TextEditor myTextEditor = new TextEditor();
        myTextEditor.openTextEditor();
        myTextEditor.writeIntoTextFile();
        myTextEditor.closeTextEditor();
    }

    public void openTextEditor(){
        System.out.println("Open tex editor");
    }
    public void writeIntoTextFile(){
        System.out.println("Write something in text file");
    }
    public void closeTextEditor(){
        System.out.println("Close the text editor");
    }
}
