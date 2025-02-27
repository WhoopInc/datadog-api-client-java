# ScatterplotTableRequest

Scatterplot request containing formulas and functions.

## Properties

| Name               | Type                                                                                      | Description                                                                                               | Notes      |
| ------------------ | ----------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | ---------- |
| **formulas**       | [**List&lt;ScatterplotWidgetFormula&gt;**](ScatterplotWidgetFormula.md)                   | List of Scatterplot formulas that operate on queries. **This feature is currently in beta.**              | [optional] |
| **queries**        | [**List&lt;FormulaAndFunctionQueryDefinition&gt;**](FormulaAndFunctionQueryDefinition.md) | List of queries that can be returned directly or used in formulas. **This feature is currently in beta.** | [optional] |
| **responseFormat** | **FormulaAndFunctionResponseFormat**                                                      |                                                                                                           | [optional] |
