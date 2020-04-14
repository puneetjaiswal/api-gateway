package com.lyft.data.gateway.ha.clustermonitor;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ClusterStats {
  private int runningQueryCount;
  private int queuedQueryCount;
  private int blockedQueryCount;
  private int numWorkerNodes;
  private boolean healthy;
  private String clusterId;
  private String proxyTo;
  private String routingGroup;
}
