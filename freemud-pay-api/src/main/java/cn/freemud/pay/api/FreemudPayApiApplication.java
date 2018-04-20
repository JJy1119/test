package cn.freemud.pay.api;

import cn.freemud.framework.druid.anno.EnableDruid;
import cn.freemud.framework.utils.EncryptUtil;
import cn.freemud.framework.msmq.annos.EnableMsmq;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;

@SpringBootApplication
@EnableMsmq
@EnableDruid
@ComponentScan("cn.freemud.*")
public class FreemudPayApiApplication {


	public static void main(String[] args) {
		String str = EncryptUtil.encrypt("fmid=ZHL1587O1552215003&operator_id=159753&partnerId=1587&reqtype=52&station_id=123&store_id=159753&trans_id=fmpay1516669804882829239&ver=44D9D26A86CCA4546AB6278B529AB0B02");
		SpringApplication.run(FreemudPayApiApplication.class, args);
	}
}
