/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso3_Bridge;

/**
 *
 * @author Rigo-PC
 */
public abstract class SistemaOperativo {
    
    protected iThreadScheduler IThreadScheduler;

    public SistemaOperativo(iThreadScheduler IThreadScheduler) {
        this.IThreadScheduler = IThreadScheduler;
    }
    
    public abstract void atenderSolicitud();
}
