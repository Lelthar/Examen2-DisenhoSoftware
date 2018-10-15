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
public class JVM extends SistemaOperativo{

    public JVM(iThreadScheduler IThreadScheduler) {
        super(IThreadScheduler);
    }
    
    @Override
    public void atenderSolicitud() {
        System.out.print("Atendiendo solicitud en JVM......");
        IThreadScheduler.ejecutar();
    }
}
