package org.module.common.dataservice.orderdataservice;

import java.util.ArrayList;

import org.module.common.po.State;
import org.module.common.po.TransportListPO;



/**
 * 中转单
 * @author 
 *
 */
public interface TransportListService {
	/**
	 * 前置：无
	 * 后置：返回所有PO
	 * @return
	 */
	public ArrayList<TransportListPO> getAll();
	/**
	 * 前置：不存在相同ID的收件单
	 * 后置：增加一个PO
	 * @return
	 */
    public boolean add(TransportListPO o);
    /**
   	 * 前置：欲修改的PO存在
   	 * 后置：更新PO信息
   	 * @param old
   	 * @param newone
   	 * @return
   	 */
   	public boolean update(TransportListPO newone);
   	/**
     * 根据状态查找
     * @param s
     * @return
     */
	public ArrayList<TransportListPO> getByState(State s);
     
}