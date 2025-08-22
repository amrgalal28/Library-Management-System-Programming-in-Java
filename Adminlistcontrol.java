import javax.swing.JOptionPane;


public class Adminlistcontrol {
    
    
    public boolean checkavailablility(Book book){
        if(book.availability){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean checkID(int id){
        for(int i = 0 ; i<(Student.students.size()-1);i++){
            if(Student.students.get(i).getID() == id){
                return true;
            }
        }
        return false;
    }
    public Book searchmaterial(int id){
        for(int i = 0 ;i<(Book.books.size()-1);i++){
            if(Book.books.get(i).getID() == id){
                return Book.books.get(i);
            }
        }
        return null;
    }
    public void addbook(int id, String name , String genre ,String author , int quantity , boolean availability){
        boolean bookcheck = checkID(id);
        if(bookcheck){
            Book book = searchmaterial(id);
            book.setQuantity(book.getQuantity()+1);
            JOptionPane.showMessageDialog(null,"book already exists, added new one.");
        }
        else{
            new Book(id,name,genre,author,quantity,availability);
            JOptionPane.showMessageDialog(null,"the Book is added successfully.");
        }
    }
    
    public void removebook(int id){
       boolean bookcheck = checkID(id);
        if(bookcheck){
            try{
            int counter = -1;
        for(Book book: Book.books){
            if(book.getID() == id){
                
                Book.books.remove(counter);
                JOptionPane.showMessageDialog(null,"the Book is deleted successfully.");
                break;
            }
            counter++;
        }
        }
            catch(IndexOutOfBoundsException e){
                    JOptionPane.showMessageDialog(null,"out of bounds exception occured.");
                }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"error exception occured.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"the Book is not found , please check your data inserted again.");
        }
    }
    
    
    public void updatebook(int id){
         boolean bookcheck = checkID(id);
        if(bookcheck){
            try{
            int counter = -1;
        for(Book book: Book.books){
            if(book.getID() == id){
                
                Book.books.remove(counter);
                JOptionPane.showMessageDialog(null,"the Book is deleted successfully.");
                break;
            }
            counter++;
        }
        }
            catch(IndexOutOfBoundsException e){
                    JOptionPane.showMessageDialog(null,"out of bounds exception occured.");
                }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"error exception occured.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"the Book is not found , please check your data inserted again.");
        }
    }
}

