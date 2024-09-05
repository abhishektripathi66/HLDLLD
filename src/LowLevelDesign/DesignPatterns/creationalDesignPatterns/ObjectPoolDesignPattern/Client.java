package LowLevelDesign.DesignPatterns.creationalDesignPatterns.ObjectPoolDesignPattern;

public class Client {
    
    public static void main(String[] args) {
        
        ConnectionPoolManager cpm = ConnectionPoolManager.getInstancConnectionPoolManager();

        Connection c1 = cpm.getConnection();
        Connection c2 = cpm.getConnection();
        Connection c3 = cpm.getConnection();
        Connection c4 = cpm.getConnection();
        Connection c5 = cpm.getConnection();
        Connection c6 = cpm.getConnection();
        cpm.getConnection();
        cpm.releaseConnection(c6);
        cpm.releaseConnection(c5);
        cpm.releaseConnection(c6);
    }
}
