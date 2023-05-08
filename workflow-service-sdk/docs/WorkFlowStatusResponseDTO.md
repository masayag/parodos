

# WorkFlowStatusResponseDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**workFlowExecutionId** | **UUID** |  |  [optional] |
|**workFlowName** | **String** |  |  [optional] |
|**works** | [**List&lt;WorkStatusResponseDTO&gt;**](WorkStatusResponseDTO.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| FAILED | &quot;FAILED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| REJECTED | &quot;REJECTED&quot; |
| PENDING | &quot;PENDING&quot; |



