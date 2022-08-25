package com.google.cloud.spark.bigquery.integration;

import com.google.cloud.spark.bigquery.BigQueryConnectorUtils;
import org.junit.Before;

public class Spark31QueryPushdownIntegrationTest extends QueryPushdownIntegrationTestBase {

  @Before
  public void before() {
    BigQueryConnectorUtils.enablePushdownSession(spark);
  }
}