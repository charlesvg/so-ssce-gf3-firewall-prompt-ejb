/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ssce.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author administrator
 */
@Stateless
public class SessionBean implements SessionBeanRemote {

    @Override
    public String getHelloWorld() {
        return "Hello World";
    }


}
