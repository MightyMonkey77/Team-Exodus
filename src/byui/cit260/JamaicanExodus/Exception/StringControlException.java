/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.Exception;

/**
 *
 * @author Office Payne
 */
public class StringControlException extends Exception {
    
      public StringControlException() {
    }

    public StringControlException(String message) {
        super(message);
    }

    public StringControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public StringControlException(Throwable cause) {
        super(cause);
    }

    public StringControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
