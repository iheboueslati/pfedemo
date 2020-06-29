package gestion.docs.adm.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@ManagedBean
@RequestScoped
public class LoginBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    @ManagedProperty(value="#{authenticationManager}")
        private AuthenticationManager authenticationManager;
        public AuthenticationManager getAuthenticationManager() {
        return authenticationManager;
    }

    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        this.authenticationManager= authenticationManager;
    }

    public String doLogin() {
        Authentication authenticationRequestToken =
              new UsernamePasswordAuthenticationToken( username, password );
        //authentication action
        try {
            Authentication authenticationResponseToken =
                authenticationManager.authenticate(authenticationRequestToken);
            SecurityContextHolder.getContext().setAuthentication(authenticationResponseToken);
            //ok, test if authenticated, if yes reroute
            if (authenticationResponseToken.isAuthenticated()) {
                //lookup authentication success url, or find redirect parameter from login bean
                return "/index";
            }
        } catch (BadCredentialsException badCredentialsException) {
            FacesMessage facesMessage =
                new FacesMessage("Login Failed: please check your username/password and try again.");
            FacesContext.getCurrentInstance().addMessage(null,facesMessage);
        } catch (LockedException lockedException) {
            FacesMessage facesMessage =
                new FacesMessage("Account Locked: please contact your administrator.");
            FacesContext.getCurrentInstance().addMessage(null,facesMessage);
        } catch (DisabledException disabledException) {
            FacesMessage facesMessage =
                new FacesMessage("Account Disabled: please contact your administrator.");
            FacesContext.getCurrentInstance().addMessage(null,facesMessage);
        }

        return null;
    }
}