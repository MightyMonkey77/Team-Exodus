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
public class DoubleControlException extends Exception {
    
    public DoubleControlException() {
    }

    public DoubleControlException(String message) {
        super(message);
    }

    public DoubleControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public DoubleControlException(Throwable cause) {
        super(cause);
    }

    public DoubleControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
