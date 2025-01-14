# LogStreamWidgetDefinition

The Log Stream displays a log flow matching the defined query. Only available on FREE layout dashboards.

## Properties

| Name                  | Type                                      | Description                                                                          | Notes      |
| --------------------- | ----------------------------------------- | ------------------------------------------------------------------------------------ | ---------- |
| **columns**           | **List&lt;String&gt;**                    | Which columns to display on the widget.                                              | [optional] |
| **indexes**           | **List&lt;String&gt;**                    | An array of index names to query in the stream. Use [] to query all indexes at once. | [optional] |
| **logset**            | **String**                                | ID of the log set to use.                                                            | [optional] |
| **messageDisplay**    | **WidgetMessageDisplay**                  |                                                                                      | [optional] |
| **query**             | **String**                                | Query to filter the log stream with.                                                 | [optional] |
| **showDateColumn**    | **Boolean**                               | Whether to show the date column or not                                               | [optional] |
| **showMessageColumn** | **Boolean**                               | Whether to show the message column or not                                            | [optional] |
| **sort**              | [**WidgetFieldSort**](WidgetFieldSort.md) |                                                                                      | [optional] |
| **time**              | [**WidgetTime**](WidgetTime.md)           |                                                                                      | [optional] |
| **title**             | **String**                                | Title of the widget.                                                                 | [optional] |
| **titleAlign**        | **WidgetTextAlign**                       |                                                                                      | [optional] |
| **titleSize**         | **String**                                | Size of the title.                                                                   | [optional] |
| **type**              | **LogStreamWidgetDefinitionType**         |                                                                                      |
