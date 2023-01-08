
package test1;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
@FacesValidator("test1.EmailValidator")
public class EmailValidator implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String email=value.toString();
        if(!(email.endsWith("@gmail.com"))){
            throw new ValidatorException(new FacesMessage("INVALID EMAIL"));
        }
    }
    
}
