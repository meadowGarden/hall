page 50104 "Reward List"
{
    PageType = List;
    UsageCategory = Lists;
    SourceTable = "Reward";
    CardPageId = "Reward Card";

    layout
    {
        area(content)
        {
            repeater("Rewards")
            {
                field("Reward ID"; Rec."Reward ID")
                {
                    ApplicationArea = All;
                }

                field("Description"; Rec."Description")
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
