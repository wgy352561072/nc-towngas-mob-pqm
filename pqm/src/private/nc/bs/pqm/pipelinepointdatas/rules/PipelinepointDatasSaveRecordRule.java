package nc.bs.pqm.pipelinepointdatas.rules;

import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pqm.pipelinepointdatas.PipelinepointdatasVO;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * ����ǰ��Աʱ���¼
 * 
 * @author wugy
 * @since 2019-03-27 09:21:00
 *
 */
public class PipelinepointDatasSaveRecordRule implements IRule<PipelinepointdatasVO> {

	@Override
	public void process(PipelinepointdatasVO[] vos) {
		if (vos == null || vos.length == 0) {
			ExceptionUtils.wrappBusinessException("���ݲ���Ϊ�գ�");
		}
		String userid = AppContext.getInstance().getPkUser();
		UFDateTime nowTime = new UFDateTime();
		for (int i = 0; i < vos.length; i++) {
			PipelinepointdatasVO vo = vos[i];
			Object pk_pressuregrade = vo.getAttributeValue("pk_pressuregrade");
			if(pk_pressuregrade == null){//�����ĵ���
				vo.setAttributeValue("creator", userid);
				vo.setAttributeValue("creationtime", nowTime);
			}else{//�޸ĵĵ���
				vo.setAttributeValue("modifier", userid);
				vo.setAttributeValue("modifiedtime", nowTime);
			}
		}
	}

}