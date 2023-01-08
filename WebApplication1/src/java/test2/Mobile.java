/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("test2.Mobile")
public class Mobile implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        StringBuilder sb=new StringBuilder();
        sb.append("91");
        sb.append(value);
        String res=sb.toString();
        return res;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
         return "";
    }
    
}
