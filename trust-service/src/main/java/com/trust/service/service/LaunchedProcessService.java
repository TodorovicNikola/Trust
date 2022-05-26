package com.trust.service.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trust.service.controller.dto.LaunchedProcessDto;
import com.trust.service.controller.dto.LaunchedProcessStatusDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LaunchedProcessService {

	@Async
	public void launchProcess(String apiKey, LaunchedProcessDto launchedProcessDto) {
		if (launchedProcessDto.getIpId() == "" || launchedProcessDto.getIpId() == null) {
			executeCBP(launchedProcessDto.getCbpId());
		} else {
			executeIP(launchedProcessDto.getCbpId(), launchedProcessDto.getIpId());
		}
	}

	public void executeCBP(String cbpId) {
		log.info("Launching CBP with id {}", cbpId);
		ProcessBuilder pb = new ProcessBuilder("sh", "play_winery_scenario.sh", cbpId);
		pb.directory(new File("../trust-dlt/test-network/"));
		pb.redirectErrorStream(true);
		try {
			Process p = pb.start();

			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
			p.waitFor();
			log.info("ok!");

			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void executeIP(String cbpId, String ipId) {
		log.info("Launching IP with id {} - {}", cbpId, ipId);

		ProcessBuilder pb = new ProcessBuilder("sh", "play_produce_wooden_box_scenario.sh", cbpId, ipId);
		pb.directory(new File("../trust-dlt/test-network/"));
		pb.redirectErrorStream(true);
		try {
			Process p = pb.start();

			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
			p.waitFor();
			log.info("ok!");

			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public LaunchedProcessStatusDto getLaunchedProcessStatus(String apiKey, String cbpId, String ipId) {
		String response = "";

		if (ipId == "" || ipId == null) {
			response = getCBPStatus(cbpId); // script_get_cbp_flow_execution_status.sh
		} else {
			response = getIPStatus(cbpId, ipId);
		}

		if (response.contains("payload")) {
			String payload = response.split("payload:")[1];
			payload = payload.substring(1, payload.length() - 1).replace("\\", "");
			return new LaunchedProcessStatusDto(payload);
		}

		return new LaunchedProcessStatusDto();
	}

	public String getCBPStatus(String cbpId) {
		log.info("Getting status for CBP with id {}", cbpId);
		ProcessBuilder pb = new ProcessBuilder("sh", "script_get_cbp_flow_execution_status.sh", cbpId);
		pb.directory(new File("../trust-dlt/test-network/"));
		pb.redirectErrorStream(true);
		try {
			Process p = pb.start();

			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line, lines = "";
			while ((line = in.readLine()) != null) {
				System.out.println(line);
				lines += line;
			}
			p.waitFor();
			log.info("ok!");

			in.close();
			return lines;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "error occured";

	}
	
	public String getIPStatus(String cbpId, String ipId) {
		log.info("Getting status for IP with id {}-{}", cbpId);
		ProcessBuilder pb = new ProcessBuilder("sh", "script_get_ip_flow_execution_status.sh", cbpId, ipId);
		pb.directory(new File("../trust-dlt/test-network/"));
		pb.redirectErrorStream(true);
		try {
			Process p = pb.start();

			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line, lines = "";
			while ((line = in.readLine()) != null) {
				System.out.println(line);
				lines += line;
			}
			p.waitFor();
			log.info("ok!");

			in.close();
			return lines;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "error occured";

	}

}
