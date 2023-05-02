
package com.dorukbiyikli.yarisma.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtility {
    
    private static final SessionFactory FACTORY;
    
    static{
        try {
            
            FACTORY = new Configuration().configure().buildSessionFactory();
            
        } catch (Exception e) {
            throw e ;
        }
        
    }
    
    public static SessionFactory getFACTORY(){
        return FACTORY; 
    }


    
}
