page 50100 ExpressionPage
{
  PageType = Card;
  ApplicationArea = All;
  UsageCategory = Documents;
  Caption = 'expression page';

  layout
  {
    area(Content)
    {
      group(Input)
      {
        Caption = 'get input from the user';
        field(number01; number01)
        {
          ApplicationArea = All;
        }

        field(number02; number02)
        {
          ApplicationArea = All;          
        }
      }

      group(Output)
      {
        Caption = 'output';
        field(res; res)
        {
          ApplicationArea = All;
          Editable = false;        
        }
      }
    }
  }
  
  actions
  {
    area(Processing)
    {
      action(run)
      {
        ApplicationArea = All;
        Caption = 'run';
        Image = ExecuteBatch;
        trigger OnAction()
        begin
          res := number01 < number02;
        end;
      }
    }
  }
  
  var
    number01: Integer;
    number02: Integer;
    res:Boolean;
}
