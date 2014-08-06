/**
 * 
 */
package org.qifeng.sbs.service;

import java.util.List;

import org.qifeng.sbs.dao.StrategyDAO;
import org.qifeng.sbs.model.Strategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 * @author jackho
 *
 */
@Service
@Transactional
public class StrategyServiceImpl implements StrategyService{

	@Autowired
	private StrategyDAO strategyDAO;

	/* (non-Javadoc)
	 * @see org.qifeng.sbs.service.StrategyService#addStrategy(org.qifeng.sbs.model.Strategy)
	 */
	public void addStrategy(Strategy strategy) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.qifeng.sbs.service.StrategyService#getStrategy(int)
	 */
	public Strategy getStrategy(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.qifeng.sbs.service.StrategyService#updateStrategy(org.qifeng.sbs.model.Strategy)
	 */
	public void updateStrategy(Strategy strategy) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.qifeng.sbs.service.StrategyService#deleteStrategy(int)
	 */
	public void deleteStrategy(int id) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.qifeng.sbs.service.StrategyService#getStrategies()
	 */
	public List<Strategy> getStrategies() {
		return strategyDAO.getStrategies();
	}
}
