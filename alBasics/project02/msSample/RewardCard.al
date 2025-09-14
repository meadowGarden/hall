page 50102 "Reward Card"
{
    PageType = Card;
    UsageCategory = Tasks;
    SourceTable = "Reward";

    layout
    {
        area(content)
        {
            group("Reward")
            {
                field("Reward ID"; Rec."Reward ID")
                {
                    ApplicationArea = All;
                }

                field("Description"; Rec."DEscription")
                {
                    ApplicationArea = All;
                }

                field("Reward Percentage"; Rec."Reward Percentage")
                {
                    ApplicationArea = All;
                }
            }
        }
    }
}
