package LowLevelDesign.DesignPatterns.creationalDesignPatterns.ObjectPoolDesignPattern;

import java.util.ArrayList;
import java.util.List;
// always use with singleton design pattern
public class ConnectionPoolManager {

    List<Connection> freeConnectionsPool = new ArrayList<>();
    List<Connection> connectionInUse = new ArrayList<>();

    int INITIAL_POOL_SIZE = 3;
    int MAX_POOL_SIZE = 6;
    private static ConnectionPoolManager cpm = null;

    private ConnectionPoolManager(){
        for(int i=0;i<INITIAL_POOL_SIZE;i++){
            freeConnectionsPool.add(new Connection());
        }
    }

    public static ConnectionPoolManager getInstancConnectionPoolManager(){
        if(cpm == null){
            synchronized(ConnectionPoolManager.class){
                if(cpm==null){
                    cpm = new ConnectionPoolManager();
                }
            }
        }
        return cpm;
    }

    public synchronized Connection getConnection(){
        if(freeConnectionsPool.isEmpty() && connectionInUse.size()<MAX_POOL_SIZE){
            freeConnectionsPool.add(new Connection());
            System.out.println("creating new connection and putting into the pool, free pool size: "+ freeConnectionsPool.size());
        }
        else if(freeConnectionsPool.isEmpty() && connectionInUse.size()>=MAX_POOL_SIZE){
            System.out.println("cannot create new connection, as max limit reached");
            return null;
        }
        Connection connection = freeConnectionsPool.remove(freeConnectionsPool.size()-1);
        connectionInUse.add(connection);
        System.out.println("Adding conection into use pool, size: "+connectionInUse.size());
        return connection;
    }

    public synchronized void releaseConnection(Connection connection){
        if(connection !=null){
            boolean removed = connectionInUse.remove(connection);
            System.out.println(removed);
            System.out.println("Removing the connection from the use pool, size: "+connectionInUse.size());
            freeConnectionsPool.add(connection);
            System.out.println("Adding the connection into the free pool, size:"+freeConnectionsPool.size());
        }
    }
    
}
