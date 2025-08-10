package enacpul;

public class Q4 { 

    private String lockerId; 

    private boolean isLocked; 

    private String passcode; 

    public Q4(String lockerId, String passcode) { 

        this.lockerId = lockerId; 

        this.passcode = passcode; 

        this.isLocked = false;  

    } 

    private class SecurityManager { 

        private boolean verify(String inputCode) { 

            return passcode.equals(inputCode); 

        } 

    } 

    public void lock() { 

        isLocked = true; 

        System.out.println("Locker is now locked."); 

    } 

    public void unlock(String code) { 

        SecurityManager sm = new SecurityManager(); 

        if (sm.verify(code)) { 

            isLocked = false; 

            System.out.println("Locker unlocked successfully."); 

        } else { 

            System.out.println("Incorrect passcode. Access denied."); 

        } 

    } 

    public boolean isLocked() { 

        return isLocked; 

    } 

    public static void main(String[] args) { 

        Q4 myLocker = new Q4("L001", "1234"); 

        System.out.println("Is locker locked? " + myLocker.isLocked()); 

        myLocker.lock();  

        System.out.println("Is locker locked? " + myLocker.isLocked()); 

        myLocker.unlock("0000");  

        System.out.println("Is locker locked? " + myLocker.isLocked()); 

        myLocker.unlock("1234");  

        System.out.println("Is locker locked? " + myLocker.isLocked()); 

    } 

} 
