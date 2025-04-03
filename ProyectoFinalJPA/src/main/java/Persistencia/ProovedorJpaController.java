/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Proovedor;
import Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Admin
 */
public class ProovedorJpaController implements Serializable {

    public ProovedorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public ProovedorJpaController(){
        emf = Persistence.createEntityManagerFactory("POOJPAPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Proovedor proovedor) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(proovedor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Proovedor proovedor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            proovedor = em.merge(proovedor);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = proovedor.getId();
                if (findProovedor(id) == null) {
                    throw new NonexistentEntityException("The proovedor with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Proovedor proovedor;
            try {
                proovedor = em.getReference(Proovedor.class, id);
                proovedor.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The proovedor with id " + id + " no longer exists.", enfe);
            }
            em.remove(proovedor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Proovedor> findProovedorEntities() {
        return findProovedorEntities(true, -1, -1);
    }

    public List<Proovedor> findProovedorEntities(int maxResults, int firstResult) {
        return findProovedorEntities(false, maxResults, firstResult);
    }

    private List<Proovedor> findProovedorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Proovedor.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Proovedor findProovedor(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Proovedor.class, id);
        } finally {
            em.close();
        }
    }

    public int getProovedorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Proovedor> rt = cq.from(Proovedor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
